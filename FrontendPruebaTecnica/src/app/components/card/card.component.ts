import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../../services/data-service.service';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  public respuesta: string;
  public mensaje: string;
  constructor(private data: DataServiceService) { }

  ngOnInit() {
}
getDetails(numero: number) {
  if (numero) {
    this.data.getClaveGenerada2(numero).subscribe((dat) => this.respuesta = dat.res);
    this.mensaje = '';
  } else {
    this.mensaje = 'Por favor ingrese un numero';
  }
}
}
