import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateTodosComponent } from './create-todos.component';

describe('CreateTodosComponent', () => {
  let component: CreateTodosComponent;
  let fixture: ComponentFixture<CreateTodosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateTodosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateTodosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
