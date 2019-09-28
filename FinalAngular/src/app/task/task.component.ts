import { Component, OnInit } from '@angular/core';
import{NgForm} from '@angular/forms';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  constructor() { }
tasks: any[]=[]
  ngOnInit() {
  }
  getTask(taskform : NgForm){
    this.tasks.push(taskform.value)
  //  this.tasks.reset()
    console.log(this.tasks)
//return this.tasks
  }
delete(task){
  return this.tasks.pop();
}
}
