import {Component} from '@angular/core';
import {VehiculoComponent} from './vehiculo/vehiculo.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [VehiculoComponent],
  template: `
        <main>
          <section class="content">
            <app-vehiculo></app-vehiculo>
          </section>
        </main>
  `,
  styleUrls: ['./app.component.css'],
})

export class AppComponent {
  title = 'vehiculos';
}
