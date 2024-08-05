mvi a, 60h
sta 2040h
mvi a, 70h
sta 2041h
lxi h,2040h
mov a,m
inx h
add m
sta 2042h