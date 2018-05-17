package marianapc.example.omen.tarjetamariana;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listaTarjetas);
        OrigenDeDatosDeTarjeta datosDeTarjeta = new OrigenDeDatosDeTarjeta();
        tarjetaAdapter adapter = new tarjetaAdapter();
        adapter.datos=datosDeTarjeta.getDatos();
        adapter.contexto=this;
        adapter.Imagen=datosDeTarjeta.getImagenes();
        lista.setAdapter(adapter);
    }
    class Tarjeta
    {//classtarjeta

        private int edad;
        private String nombre;
        private String descripcion;
        private int img;

        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public void setImg(int img) {
            this.img = img;
        }


        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public int getImg() {
            return img;
        }

        public Tarjeta(int edad, String nombre, String descripcion, int img)
        {
            this.edad = edad;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.img = img;
        }

        public Tarjeta()
        {

        }
    }//classtarjeta

    class OrigenDeDatosDeTarjeta
    {//classorigen

        public OrigenDeDatosDeTarjeta()
        {
        }

        public ArrayList<String> getImagenes (){
            ArrayList <String> Imagen = new ArrayList<String>();
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/thumbnail/tracer-concept.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/thumbnail/reaper-concept.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/thumbnail/winston-concept.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/thumbnail/dva-concept.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/screenshot/sombra-screenshot-006-6de9884047e0fa523c234ce979e9418a573ea758ab7166d58c90e6118a3a849b6dab2a0ead43a7b4720e657c502e1fe94fc1913ff5a2be7df0b01d8b36ec9c3b.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/thumbnail/genji-concept.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/thumbnail/mei-concept.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/thumbnail/mccree-concept.jpg");
            Imagen.add("https://i.ytimg.com/vi/FSjlJFi-ZwM/hqdefault.jpg");
            Imagen.add("https://d1u1mce87gyfbn.cloudfront.net/media/artwork/soldier-76-concept.jpg");

            return Imagen;
        }
        public ArrayList <Tarjeta> getDatos() {
            ArrayList<Tarjeta> datos = new ArrayList<Tarjeta>();

            Tarjeta uno = new Tarjeta();
            uno.setNombre("Daniel");
            uno.setDescripcion("Se llama Daniel y tiene 19 años");
            uno.setEdad(19);
            uno.setImg(1);
            datos.add(uno);

            Tarjeta dos = new Tarjeta();
            dos.setNombre("Cesar");
            dos.setDescripcion("Se llama Cesar y tiene 18 años");
            dos.setEdad(18);
            dos.setImg(2);
            datos.add(dos);

            Tarjeta tres = new Tarjeta();
            tres.setNombre("Edson");
            tres.setDescripcion("Se llama Edson y tiene 18 años");
            tres.setEdad(18);
            tres.setImg(3);
            datos.add(tres);

            Tarjeta cuatro = new Tarjeta();
            cuatro.setNombre("Dario");
            cuatro.setDescripcion("Se llama Dario y tiene 18 años");
            cuatro.setEdad(18);
            cuatro.setImg(4);
            datos.add(cuatro);

            Tarjeta cinco = new Tarjeta();
            cinco.setNombre("Jonathan");
            cinco.setDescripcion("Se llama Jonathan y tiene 19 años");
            cinco.setEdad(19);
            cinco.setImg(5);
            datos.add(cinco);

            Tarjeta seis = new Tarjeta();
            seis.setNombre("Donovan");
            seis.setDescripcion("Se llama Donovan y tiene 17 años");
            seis.setEdad(17);
            seis.setImg(6);
            datos.add(seis);

            Tarjeta siete = new Tarjeta();
            siete.setNombre("Edgar");
            siete.setDescripcion("Se llama Edgar y tiene 17 años");
            siete.setEdad(17);
            siete.setImg(7);
            datos.add(siete);

            Tarjeta ocho = new Tarjeta();
            ocho.setNombre("Ivan");
            ocho.setDescripcion("Se llama Ivan y tiene 18 años");
            ocho.setEdad(18);
            ocho.setImg(8);
            datos.add(ocho);

            Tarjeta nueve = new Tarjeta();
            nueve.setNombre("Alan");
            nueve.setDescripcion("Se llama Alan y tiene 18 años");
            nueve.setEdad(18);
            nueve.setImg(9);
            datos.add(nueve);

            Tarjeta diez = new Tarjeta();
            diez.setNombre("Claudia");
            diez.setDescripcion("Se llama Claudia y tiene 18 años");
            diez.setEdad(18);
            diez.setImg(10);
            datos.add(diez);

            return datos;
        }

    }//classorigen

    class tarjetaAdapter extends BaseAdapter //se programa el adaptador que es el que comunica el modelo con la vista (tarjeta)
    {
        public ArrayList<String> Imagen;
        public ArrayList<Tarjeta> datos;
        Context contexto; //enlazar al que lo va a usar principal, donde ActivityMain usaría tarjeta (enlace activitymain-tarjeta)
        @Override
        public int getCount() {
            return datos.size();
        }//retorna la posicion del arreglo

        @Override
        public Object getItem(int i) {
            return datos.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater vinculo = LayoutInflater.from(contexto);
            View v=vinculo.inflate(R.layout.tarjeta,null);
            TextView nombrePersona = (TextView)v.findViewById(R.id.nombrePersona);
            nombrePersona.setText(datos.get(i).nombre);
            TextView edadPersona = (TextView)v.findViewById(R.id.edadPersona);
            edadPersona.setText(""+datos.get(i).edad);
            TextView descripcionPersona = (TextView)v.findViewById(R.id.descripcionPersona);
            descripcionPersona.setText(datos.get(i).descripcion);
            ImageView imagenPerfil = (ImageView)v.findViewById(R.id.imagenPerfil);
            Picasso.with(contexto).load(Imagen.get(i)).into(imagenPerfil);

            return v;
        }

    }//classadapter




}//Principal


