import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { CropListComponent } from './crop-list.component';

describe('CropListComponent', () => {
  let component: CropListComponent;
  let fixture: ComponentFixture<CropListComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ CropListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CropListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
