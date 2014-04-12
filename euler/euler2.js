var total = 0;
var x = 1;
var y = 2;
var tx, ty;
while (y<4000000) {
  total+=y;
  tx = x + 2*y;
  ty = 2*x + 3*y;
  x=tx; y=ty;
}
console.log(total);

