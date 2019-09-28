import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
 
users:any [] =[];
  constructor(private http:HttpClient) {
    http.get<any>('https://jsonplaceholder.typicode.com/users')
    .subscribe(data => {
      this.users = data;
      console.log(this.users);
    

   });
  }
  
  ngOnInit() {
  }

}
