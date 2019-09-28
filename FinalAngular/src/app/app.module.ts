import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { TaskComponent } from './task/task.component';
import { RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { PnfComponent } from './pnf/pnf.component';
import { Home1Component } from './home1/home1.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    HomeComponent,
    Home1Component,
    PnfComponent,
    UsersComponent,
    AppComponent,
    HeaderComponent,
    TaskComponent,
    PnfComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path:'home',component:HomeComponent},
      {path:'header',component:HeaderComponent},
      {path:'task',component:TaskComponent},
      {path:'users',component:UsersComponent},
      {path:'home1',component:Home1Component},
      {path:'**',component:PnfComponent}
      
    ]),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
