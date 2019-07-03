import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { tokenName } from '@angular/compiler';
@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
  constructor(private http: HttpClient) { }
  headers: HttpHeaders = new HttpHeaders({
    'Content-Type': 'application/json'
  });
  getClaveGenerada(num: number): Observable<any> {
// tslint:disable-next-line: variable-name
    const url_api = `http://localhost:8080/generarClave?numero=${num}`;
    return (this.http.get(url_api));
  }
  getClaveGenerada2(num: number): Observable<any> {
    // tslint:disable-next-line: variable-name
        const url_api = 'http://localhost:8080/generarClave2?numero=' + num;
        // console.log(this.datos = this.http.get(url_api).pipe(map(data => data)));
        return (this.http.get(url_api));
      }
}
