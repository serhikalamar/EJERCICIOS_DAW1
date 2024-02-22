const numeroDiv = document.getElementById('face front');


const cambiarNumeroButton = document.getElementById('cambiarNumero');


cambiarNumeroButton.addEventListener('click', function() {
  
  numeroDiv.textContent = parseInt(Math.random()*6) + 1;
});
