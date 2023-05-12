import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoComponent } from './components/logo/logo.component';
import { RedesComponent } from './components/redes/redes.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercadComponent } from './components/acercad/acercad.component';
import { ExperiencialComponent } from './components/experiencial/experiencial.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import  {  NgCircleProgressModule  }  from  'ng-circle-progress';
import { SoftkillsComponent } from './components/softkills/softkills.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component' ;

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoComponent,
    RedesComponent,
    BannerComponent,
    AcercadComponent,
    ExperiencialComponent,
    EducacionComponent,
    SoftkillsComponent,
    ProyectoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule . forRoot ( {})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
