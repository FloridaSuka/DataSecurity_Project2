# DataSecurity_Project2
## Udhëzime për Ekzekutimin e Programit

Ky aplikacion Java implementon dy algoritme të sigurisë së mesazheve:
    Book Cipher, Route Transposition.
    Kërkesat për ekzekutim:
    Java 8 ose version më i ri i instaluar në sistem,
    IDE si IntelliJ IDEA, Eclipse, ose terminal (komand-line) për të kompiluar dhe ekzekutuar programin,
    file teksti (.txt) që do përdoret si libër referues për algoritmin Book Cipher.
		
➤ Si të ekzekutohet programi
  1. Hapni projektin në IntelliJ IDEA ose IDE-në tuaj të preferuar.
  2. Ekzekuto Main.java (që ndodhet në folderin src) duke klikuar butonin Run ose përmes komandës në terminal: javac Main.java, java Main
  3. Pas ekzekutimit, do ju kërkohet të zgjedhni algoritmin që dëshironi të përdorni: (1. Book Cipher, 2. Route Transposition) si dhe të zgjedhni veprimin: (1. Enkriptim, 2. Dekriptim).

Nëse zgjidhni Book Cipher, do ju kërkohet të jepni path-in drejt një .txt file që përmban tekst (libri).
Për enkriptim një mesazh që do të enkriptohet, kurse për dekriptim do te kerkohet te jepni numra të ndarë me hapësirë që përfaqësojnë pozitat e fjalëve në libër.

***
## Route Transposition Cipher - Përshkrimi i algoritmit
Algoritmi **Route Transposition Cipher** është një teknikë enkriptimi që përdor një matrice për të ndryshuar rendin e shkronjave në mesazh. Karakteret futen në një matricë me madhësi `rreshta x kolona`, mbushen rresht pas rreshti, dhe lexohen kolonë pas kolone për të gjeneruar tekstin e enkriptuar.

- **Mbushja:** Rresht-pas-rreshti (left → right, top → bottom)
- **Leximi:** Kolonë-pas-kolone (top → bottom, left → right)
- **Padding:** Karakteri `'X'` përdoret për të plotësuar matricën nëse është e nevojshme.
*** 
## Shembulli 1
### Enkriptimi
**Plaintext**: PERSHENDETJE  
Si do duket matrica(3 x 4):  
```
     MBUSHJA                          LEXIMI

P  -> 	E  -> 	R		p   |	E   |	R  |
S  -> 	H  -> 	E		S   |	H   |	E  |
N  -> 	D  -> 	E		N   |	D   |	E  |	
T  -> 	J  -> 	E		T   V	J   V	E  V
```
![image](https://github.com/user-attachments/assets/6ba460bf-b66a-434b-8bb3-d8122eebf6ea)
### Dekriptimi
///
///
///
***
## Shembulli 2
### Enkriptimi
**Plaintext**: This is a test  
Si do duket matrica(3 x 4):  
```
    MBUSHJA                          LEXIMI

T  ->  H  ->  I          	T   |  H   |  I  |
S  ->  I  ->  S	  	        S   |  I   |  S  |
A  ->  T  ->  E          	A   |  T   |  E  |
S  ->  T  ->  X          	S   V  T   V  X  V

```
![image](https://github.com/user-attachments/assets/74e680bd-be08-4f50-b4a8-6e89a55b430c)
### Dekriptimi
///
///
///

