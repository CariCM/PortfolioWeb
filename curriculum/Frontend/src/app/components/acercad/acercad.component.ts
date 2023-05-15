import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acercad',
  templateUrl: './acercad.component.html',
  styleUrls: ['./acercad.component.css']
})
export class AcercadComponent implements OnInit {
  persona:persona=new persona("","","")

  constructor(public personaService: PersonaService) { }

  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data =>{this.persona = data})
  }

}
