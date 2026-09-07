const solution = mtrx => {  
  return mtrx.some((r) => (r.indexOf('>')+1)*(r.indexOf('x')+1)&&r.indexOf('>')+1<r.indexOf('x')+1)
}
