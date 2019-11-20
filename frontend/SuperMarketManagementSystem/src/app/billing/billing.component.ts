import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-billing',
  templateUrl: './billing.component.html',
  styleUrls: ['./billing.component.css']
})
export class BillingComponent implements OnInit {
  submitted = false;
  currentDate: number = Date.now();


  constructor() { }

  onSubmit() {
    this.submitted = true;
  }

  ngOnInit() {
  }

}
