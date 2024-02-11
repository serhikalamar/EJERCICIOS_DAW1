function areYouPlayingBanjo(name) {
    // Implement me
    if(name.substring(0,1) == "R" || name.substring(0,1) == "r"){
      return name + " plays banjo";
    }else {
      return name + " does not play banjo";
    }
    return name;
  }