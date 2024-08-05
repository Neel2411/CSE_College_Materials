mvi b,77h
mov a,b
out 00h
in 01h
lxi b, 2050h
mvi a,88h
sta 2050h
mvi a,00h
ldax b
mvi a,10h
stax b