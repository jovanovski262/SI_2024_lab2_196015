Даниел Јовановски, 196015

<hr>

<b>Control Flow Graph</b>


<img width="828" alt="checkCardCGF" src="https://github.com/jovanovski262/SI_2024_lab2_196015/assets/60225356/d0dfeaf6-afdc-4bde-8b0a-b61f68e7024a">


<hr>

<b>Цикломатска комплексност</b>

Цикломатската комплексност ја добив со формулата бројот на ребра (Е) - бројот на јазли (N) + 2 и изнесува 7.
E = 23
N = 18
E - N + 2 = 7

<hr>

<b>Тест случаи според критериумот Every Branch</b>



C1	"Null, X - 
allItems list is null"	(“Item1”, “123456”, 200, 0.2f), 300 - true	(“Item1”, null, 200, 0.2f), 300 - barcode null	(Null, “123456”, 5000, 0.2f), 300 - name null I false 	(Null, “a”, 5000, 0.2f), 300 - barcode error 	(Null, “123”, 5000, 0.0f), 300 - discount error 	(Null, “0123”, 5000, 0.0f), 300 - barcode starts with 0 
A - B	*	*	*	*	*	*	*
B - R	*						
B - C			*	*	*	*	*
C - D		*	*	*	*	*	*
D - E		*	*	*	*		
D - O		*				*	*
O - P		*					
O - Q				*		*	*
E - F				*	*	*	*
F - G				*	*	*	*
E - G		*	*	*			
G - H		*				*	*
G - R			*				
H - I		*		*	*	*	*
H - J		*		*		*	*
I - R					*		
I - H		*				*	*
J - K		*					
J - L						*	*
K - M 		*					
L - M 						*	*
M - N 							*
M - D		*		*			
N - D							*<img width="485" alt="image" src="https://github.com/jovanovski262/SI_2024_lab2_196015/assets/60225356/82667d69-cba8-480d-b79f-6d9df6f01523">
