import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  constructor(private http:HttpClient) { }

  power(num1:any,num2:any)
  {
    return this.http.post(`http://localhost:8083/power/${num1}/${num2}`,null);
  }
  sqrt(num1:any)
  {
    return this.http.post(`http://localhost:8083/sqrt/${num1}`,null);
  }
  log(num1:any)
  {
    return this.http.post(`http://localhost:8083/log/${num1}`,null);
  }
  factorial(num1:any)
  {
    return this.http.post(`http://localhost:8083/factorial/${num1}`,null);
  }

}
