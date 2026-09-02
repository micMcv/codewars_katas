function collision(x1, y1, radius1, x2, y2, radius2) {
  
  const dX = Math.abs(x2-x1);
  const dY = Math.abs(y2-y1);
  const dist = Math.sqrt(dX*dX+dY*dY);
  
  return dist < radius1 + radius2
}
