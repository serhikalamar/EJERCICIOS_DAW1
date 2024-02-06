// Seleccionar el botón de cambio de tema
var toggleThemeButton = document.getElementById('toggle-theme-btn');

// Añadir un evento de clic al botón
toggleThemeButton.addEventListener('click', function() {
  // Alternar la clase 'dark-mode' en el elemento body
  document.body.classList.toggle('dark-mode');
});


function ejercicio (){
    let numero = 0 ;

    while(numero <= 10 ){
        console.log(numero);
        alert(numero);
        numero++
    }
}

function ejercicio2 (){
    let numero1, numero2;
    console.log("Escribe dos numeros");
    numero1 = prompt();
    numero2 = prompt();

    alert(numero1 = numero1 > numero2 ? numero1 : numero2);
}
function ejercicio3 () {
    let numero1 , numero2 ;

    numero1 = parseInt(prompt("Escribe dos numeros para sumarlos entre ellos"));
    numero2 = parseInt(prompt("otro mas"));
    alert("La suma de los dos numeros es " +(numero1 + numero2));

}
function ejercicio4() {
    let nom, edat, estatura, estatcivil;
    nom = prompt("Escribe tu nombre");
    edat = promt("Escribe tu edad");
    estatura = prompt("Escribe tu estatura");
    estatcivil = prompt("Escribe tu estado civil");

    if(estatcivil == "soltero" || estatcivil == "Soltero"){
        console.log(nom);
        console.log(edat);
        console.log(estatura);
        console.log(estatcivil);
    }if (estatcivil == "casado" || estatcivil == "Casado"){
        alert("" + nom + edat + estatura + estatcivil);
    }else {
        alert("error vuelve a escribir todo")
        ejercicio4();
    }
}
function ejercicio5(){
    let palabra;

    console.log("Escribe una palabra")
    palabra = prompt();
    console.log("La palabra tiene" + palabra.length + "caracteres");
}

function ejercicio6(){
    let array = ["Enero","Febrero", "Marzo", "Abril" ,"Mayo", "Junio" , "Julio","Agosto", "Septiembre", "Octubre", "Noiembre", "Diciembre"]
    for(let i = 0; i < array.length ; i++){
        console.log(array[i]);
    }

}
function ejercicio7(){
    let numero;
    console.log("escribe tu nota");
    numero = promt
    switch(numero){
        case(1-4):
            console.log("suspendido");
            break;
        case 5:
            console.log("suficiente");
            break;
        case 6:
            console.log("bien");
            break
        case 7-8:
            console.log("Notable");
            break
        case 9-10:
            console.log("excelente");
            break
        default:
            break
    }
}
function ejercicio8(){
    let numero;

    console.log("escribe un numero");
    numero = prompt();
    if(numero % 2 == 0){
        console.log("es un nombre parell");
    }else {
        console.log("Es un nombre imparell");
    }
    ejercicio8();
}
function ejercicio9 (){
    var texto;
    var cadena = "";
    console.log("Escribe una cadena de texto");
    texto = prompt();

    for(var i = texto.length - 1 ; i >= 0 ; i--){
        cadena += texto[i];
    }
    console.log(cadena);
}

function ejercicio10(){
    let persona = {firstname:"sergi",edat:"21",telefono:"688726965" }
    console.log(persona);
    document.write(persona);

}
function cambiocolor(){
    var boton = document.getElementById("cambiocolor");
    
    toggleThemeButton.addEventListener('click', function() {
        // Alternar la clase 'dark-mode' en el elemento body
        document.body.classList.toggle('dark-mode');
      });
}
function Ej3_4(){
    let marca = document.getElementById("opciones").value;
    let precio = document.getElementById("precio").value;
  
    if (isNaN(precio)) {
      alert("Por favor, ingrese un precio válido.");
      return;
    }
  
    if(marca == "Ford"){
      alert("El precio final de su coche"+ marca + "es de: "+ precio - ((10/100)*precio));
    }
    else if(marca == "Seat"){
      alert("El precio final de su coche"+ marca + "es de: "+ precio - ((8/100)*precio));
    }
    else if(marca == "Citroen"){
      alert("El precio final de su coche"+ marca + "es de: "+ precio - ((6/100)*precio));
    }
    else if(marca == "Audi"){
      alert("El precio final de su coche"+ marca + "es de: "+ precio - ((4/100)*precio));
    }
  }
