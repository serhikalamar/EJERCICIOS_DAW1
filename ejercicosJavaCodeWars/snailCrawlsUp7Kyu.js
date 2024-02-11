function snail(column, day, night) {
    let totalDistanceClimbed = 0;
    let days = 0;
  
    while (true) {
      totalDistanceClimbed += day;
      days++;
  
      if (totalDistanceClimbed >= column) {
        return days;
      }
  
      totalDistanceClimbed -= night;
  
      if (totalDistanceClimbed >= column) {
        return days;
      }
    }
  }