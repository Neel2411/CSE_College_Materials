mvi a,10h
sta 2040h
mvi a,20h
sta 2041h
mvi a,30h
sta 2042h
mvi a,40h
sta 2043h
lxi h, 2042h
mov a,m
dcx h
mov b,m
dcx h
sub m
sta 2044h
lda 2043h
sub b
sta 2045h