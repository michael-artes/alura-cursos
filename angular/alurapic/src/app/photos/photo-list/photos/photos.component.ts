import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';
import { Photo } from '../../photo/photo';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})
export class PhotosComponent implements OnChanges {
  
  @Input() photos: Photo[];
  
  rows: any[] = [];
  
  constructor() { }
  
  //onChange quando o databiding sofre alguma alteracao
  //ele tera uma mesmo propriedade que vem do bindingPropertyName
  //pelo @Input()
  ngOnChanges(changes: SimpleChanges) {
    if (changes.photos) {
      this.rows = this.getGroupColumns(this.photos);
    }
  }

  getGroupColumns(photos: Photo[]) {
    const newRows = [];

    for (let index = 0; index < photos.length; index += 3) {
      let newArrayPhotos = photos.slice(index, index + 3);
      newRows.push(newArrayPhotos);
    }
    return newRows;
  }

}
