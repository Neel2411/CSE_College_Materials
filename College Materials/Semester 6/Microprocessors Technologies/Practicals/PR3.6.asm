MVI A, 05H
STA 2200H
MVI A, 02H
STA 2201H
MVI A, 03H
STA 2202H
MVI A, 04H
STA 2203H
MVI A, 06H
STA 2204H
MVI A, 05H
STA 2200H

LDA 2200H

MOV C, A

MVI B, 00H

LXI H, 2201H

BACK: MOV A, M

ANI 01H

JNZ SKIP

MOV A, B

ADD M

MOV B, A

SKIP: INX H

DCR C

JNZ BACK

MOV A, B

STA 2210H

HLT

