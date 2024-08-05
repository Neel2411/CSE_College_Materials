
mvi a,10h
sta 2500h
mvi a,20h
sta 2501h
lxi h,2500h
mov a,m
inx h
add m

daa
jnc l1
inr c
l1: sta 2503h
mov a,c 
sta 2502h

