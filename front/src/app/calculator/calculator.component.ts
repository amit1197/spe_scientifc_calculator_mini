import { Component, OnInit } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  num1:any;
  num2:any;
  num3:any;
  constructor(private calser:CalculatorService) { }

  ngOnInit(): void {

  }
  power()
  {
    this.calser.power(this.num1,this.num2).subscribe(
      data=>
      {
        this.num3=data;
      }
    )
  }
  sqrt()
  {
    this.calser.sqrt(this.num1).subscribe(
      data=>
      {
        this.num3=data;
      }
    )

  }
  log()
  {
    this.calser.log(this.num1).subscribe(
      data=>
      {
        this.num3=data;
      }
    )

  }
  factorial()
  {
    this.calser.factorial(this.num1).subscribe(
      data=>
      {
        this.num3=data;
      }
    )

  }

}
