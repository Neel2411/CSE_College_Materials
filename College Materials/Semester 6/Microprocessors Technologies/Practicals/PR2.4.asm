	   MVI C,00
	   MVI A,ffh
	   STA 2500
	   MVI A,32
	   STA 2501
	   LHLD 2500
	   MOV A,L
	   ADD H
	   DAA
	   JNC L1
	   INR C

L1:	   STA 2502
	   MOV A,C
	   STA 2503
	   HLT
