function ej1(){
    for(var i = 1; i < 10; i++){
        console.log(i);
        document.write(i);
    }

}
function ej2(){
    var a = prompt("Escribe dos numeros");
    var b = prompt();
    if(a > b){
        alert("El primer numero es mayor: " + a);
        console.log(a);
        document.write(a);
    }else{
        alert("El segundo numero es mayor: " + b);
        console.log(b);
        document.write(b);    
    }

}
function ej3(){
    let a = parseInt(prompt("Escribe dos numeros"));
    let b = parseInt(prompt());
    var c = a + b;
    alert(c);
    console.log(c);
    document.write(c);
}
function ej4(){
    let nom = prompt("Escribe tu nombre");
    let edad = prompt("Edad");
    let estatura = prompt("Estatura");
    let EstadoCivil = prompt("Estado civil(soltero/casado)");
    // saber como poner espacios y hacerlo en columnas
    if(EstadoCivil == "Soltero" || EstadoCivil == "soltero"){
        alert(nom + edad + estatura + EstadoCivil);
        document.write(nom + edad + estatura + EstadoCivil);
        console.log(nom + edad + estatura + EstadoCivil);
    }else{
        document.write(nom);
        document.write(edad);
        document.write(estatura);
        document.write(EstadoCivil);
    }
    
}
function ej5(){
    let palabra = prompt("Escribe una palabra");
    alert("La palabra tiene: " + palabra.length + " caracteres");
}
// mirar como funciona un forEach
function ej6(){
 let meses = ["Enero" , "Febrero", "Marzo", "Abril", "Mayo", "Junio" , "Julio", "Agosto" ,"Septiembre", "Octubre" ,"Noviembre", "Diciembre"];
  for(let numero of meses){
    console.log(meses[numero]);
    document.write(meses[numero]);
 }
}
function ej7(){

}
function ej8(){
    let bucleOut = false;
    while(bucleOut == false){
        let a = prompt("Escribe un numero y diré si es par o impar.(Para salir del programa escriba 'A')");
        if(a == "A"){
            bucleOut = true;
        }
        if(a % 2 == 0){
            alert("Es numero par");
        }
        if(a % 2 != 0){
            alert("Es numero impar");
        }
    }

}
function ej9(){
    let frase = prompt("Escribe una frase");
    for(var i = frase.length; i >= 0 ; i--){
        console.log(frase.charAt(i));
        document.write(frase.charAt(i));
    }

}
function ej10(){
    class humano {
        constructor(){
            
        }
    }
    var persona = {
        nom: Sergi,
        edat: 21,
        telefono:688726964,
    }
}
// como contar frases.
function ej11(){
    var frase = prompt("Escribe una frase");

}
function ej12(){
    for(var i = 0; i < 5; i++){
        for(var b = 0; b < i;b++ ){
            console.log("*");
            document.write("*");
        }
        document.write(" ");
    }
}
function ej13(){
    var a = prompt("Escribe 3 numeros");
    var b = prompt();
    var c = prompt ();
    if(a < b || a < c){
        console.log("El numero "+ a + " es el mas pequeño");
    }
    if(c < b || c < a){
        console.log("El numero "+ c + " es el mas pequeño");
    }
    if(b < a || b < c){
        console.log("El numero "+ b + " es el mas pequeño");
    }
}
function ej14(){
    var alfanumerico = prompt("Escribe numeros y letras");
    
}
function ej15(){
    
}