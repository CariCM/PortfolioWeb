import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoComponent } from './components/logo/logo.component';

import { BannerComponent } from './components/banner/banner.component';
import { AcercadComponent } from './components/acercad/acercad.component';
import { ExperiencialComponent } from './components/experiencial/experiencial.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import  {  NgCircleProgressModule  }  from  'ng-circle-progress';
import { SoftkillsComponent } from './components/softkills/softkills.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { FooterComponent } from './components/footer/footer.component' ;
import {HttpClient, HttpClientModule} from   '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoComponent,
   
    BannerComponent,
    AcercadComponent,
    ExperiencialComponent,
    EducacionComponent,
    SoftkillsComponent,
    ProyectoComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule . forRoot ( {}),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
