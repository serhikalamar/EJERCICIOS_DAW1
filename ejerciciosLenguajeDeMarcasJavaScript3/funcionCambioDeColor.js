// Seleccionar el botón de cambio de tema
var toggleThemeButton = document.getElementById('toggle-theme-btn');

// Añadir un evento de clic al botón
toggleThemeButton.addEventListener('click', function() {
  // Alternar la clase 'dark-mode' en el elemento body
  document.body.classList.toggle('dark-mode');
});
