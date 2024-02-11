function moveZeros(arr) {
    var nonZeros = [];
    var zeros = [];
  
    // Separar los elementos no cero y los ceros
    for (var i = 0; i < arr.length; i++) {
      if (arr[i] !== 0) {
        nonZeros.push(arr[i]);
      } else {
        zeros.push(arr[i]);
      }
    }
  
    // Concatenar los dos arrays
    var result = nonZeros.concat(zeros);
  
    return result;
  }