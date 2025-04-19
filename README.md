# DataSecurity_Project2
## Udhëzime për Ekzekutimin e Programit
Ky aplikacion Java implementon dy algoritme të sigurisë së mesazheve:
    **Book Cipher, Route Transposition**.
### Kërkesat për ekzekutim:
- Java 8 ose version më i ri i instaluar në sistem,
- IDE si IntelliJ IDEA, Eclipse, ose terminal (komand-line) për të kompiluar dhe ekzekutuar programin,
- file teksti (.txt) që do përdoret si libër referues për algoritmin Book Cipher.
### Si të ekzekutohet programi
  1. Hapni projektin në IntelliJ IDEA ose IDE-në tuaj të preferuar.
  2. Ekzekuto Main.java (që ndodhet në folderin src) duke klikuar butonin **Run▶️** ose përmes komandave:
```bash
javac Main.java
java Main
```
  3. Pas ekzekutimit, do ju kërkohet të zgjedhni algoritmin që dëshironi të përdorni:
```
Zgjedh algoritmin:
1. Book Cipher  
2. Route Transposition
```

5. Pastaj do ju kërkohet të zgjidhni veprimin:
```
Zgjedh algoritmin:
1. Enkriptim  
2. Dekriptim
```
Nëse zgjidhni **Book Cipher**, do ju kërkohet të jepni path-in drejt një .txt file që përmban tekst (libri).
```
--📖 Book Cipher--
Shkruaj path-in e file-it të librit (p.sh. C:\\libri.txt):
```
Për *enkriptim*, jepni një mesazh që dëshironi të enkriptoni; ndërsa për *dekriptim*, kërkohet të jepni numra të ndarë me hapësirë që përfaqësojnë pozitat e fjalëve në libër.
Nëse zgjidhni **Route Transposition**, kërkohet futja e një mesazhi për *enkriptim ose dekriptim*, në varësi të veprimit të zgjedhur.
Pas përfundimit të një veprimi, programi do t’ju mundësojë të zgjidhni nëse dëshironi të vazhdoni me të njëjtin algoritëm, të ndërroni algoritmin, ose të mbyllni programin.
```
➕ Çfarë dëshiron të bësh tani?
1. Vazhdo me të njëjtin algoritëm
2. Ndërro algoritmin
3. Mbyll programin
```
**Për të parë se si funksionon programi më hollësisht, [klikoni këtu për të parë videon](./demo/demo-video.mp4).**

***
## Përshkrimi i algoritmit
### Book Cipher
**Book Cipher** është një algoritëm enkriptimi klasik që përdor një tekst ekzistues (zakonisht një libër) si çelës referues për të fshehur mesazhin. Sekretësia varet nga libri, nëse libri nuk dihet, nuk dekodohesh dot. Mund të përdoret për enkriptim të fjalëve të plota ose vetëm të shkronjave të para të tyre. Është i thjeshtë për t’u implementuar por i fuqishëm nëse përdoret me kujdes. 

 • Libri ndahet në fjalë të renditura sipas radhës.  
 • Për çdo fjalë ose shkronjë të mesazhit, gjejmë pozitën (indeksin) përkatës në libër dhe e ruajmë atë si numër.  
 • Mesazhi i enkriptuar është një varg numrash që përfaqësojnë pozitat e fjalëve në libër.
### Route Transposition Cipher 
Algoritmi **Route Transposition Cipher** është një teknikë enkriptimi që përdor një matrice për të ndryshuar rendin e shkronjave në mesazh. Karakteret futen në një matricë me madhësi `rreshta x kolona`, mbushen rresht pas rreshti, dhe lexohen kolonë pas kolone për të gjeneruar tekstin e enkriptuar.

- **Mbushja:** Rresht-pas-rreshti (left → right, top → bottom)
- **Leximi:** Kolonë-pas-kolone (top → bottom, left → right)
- **Padding:** Karakteri `'X'` përdoret për të plotësuar matricën nëse është e nevojshme.
*** 
## Shembuj të rezultateve të ekzekutimit
### Book Cipher
#### Shembull 1
****Enkriptimi****  
***Plaintext***: hgj  
****Dekriptimi****  
***Ciphertext***: jjhj
**
#### Shembull 2
****Enkriptimi****  
***Plaintext***: hgj  
****Dekriptimi****  
***Ciphertext***: jjhj
***
### Route Transposition Cipher
#### Shembulli 1
****Enkriptimi****  
***Plaintext***: PERSHENDETJE  
Si do duket matrica(3 x 4):  
```
     MBUSHJA                          LEXIMI

P  -> 	E  -> 	R		p   |	E   |	R  |
S  -> 	H  -> 	E		S   |	H   |	E  |
N  -> 	D  -> 	E		N   |	D   |	E  |	
T  -> 	J  -> 	E		T   V	J   V	E  V
```
![image](https://github.com/user-attachments/assets/6ba460bf-b66a-434b-8bb3-d8122eebf6ea)  
****Dekriptimi****  
///  
///
  
![image](https://github.com/user-attachments/assets/3194ea54-4efe-4f8c-a5a0-cda37067ef2f)

**
#### Shembulli 2
****Enkriptimi****  
***Plaintext***: This is a test   
Si do duket matrica(3 x 4):  
```
    MBUSHJA                          LEXIMI

T  ->  H  ->  I          	T   |  H   |  I  |
S  ->  I  ->  S	  	        S   |  I   |  S  |
A  ->  T  ->  E          	A   |  T   |  E  |
S  ->  T  ->  X          	S   V  T   V  X  V

```
![image](https://github.com/user-attachments/assets/74e680bd-be08-4f50-b4a8-6e89a55b430c)  
****Dekriptimi****  
///  
///  
![image](https://github.com/user-attachments/assets/d2528817-c600-4556-965e-46a65bb0566e)


