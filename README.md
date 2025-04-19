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
### 🎬 Demonstrim i Programit
⬇️ **[Kliko këtu për të parë videon si funksionon programi](https://github.com/FloridaSuka/DataSecurity_Project2/raw/main/viedo.mp4)**
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
****Enkriptimi me fjalë të plota****  
***Plaintext***: Ujerat e fresket zhurmonin prane pyllit  
<img width="440" alt="image" src="https://github.com/user-attachments/assets/c29860dd-0cd1-4de3-b0d9-e55b8fe48b97" />

****Dekriptimi me fjalë të plota****  
***Ciphertext***: 175 25 45 83 84 87  
<img width="350" alt="image" src="https://github.com/user-attachments/assets/d13490cb-1b43-4c54-98d6-9d487882ce18" />  
***
#### Shembull 2
****Enkriptimi me shkronjën e parë****  
***Plaintext***: Siguria e te dhenave  
<img width="436" alt="image" src="https://github.com/user-attachments/assets/1e2da56c-3bdc-4df3-a658-94f62db93774" />

****Dekriptimi me shkronjën e parë****  
***Ciphertext***: 19 2 9 31 101 1 25 7 29 28 57 43 4 3 22 44  
<img width="339" alt="image" src="https://github.com/user-attachments/assets/6ba28bcd-d1b4-4f4a-a000-a1497f3a1db0" />

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
***
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


