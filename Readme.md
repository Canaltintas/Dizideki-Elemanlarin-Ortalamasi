# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Odev Dizideki sayıların harmonik ortalamasını hesaplayan program

Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

## Programın Çalışması
### Main Metotu:
- integer türünde "boundary" isimli bir değişken oluşturulur.
- Kullanıcıdan dizinin eleman sayısı istenir ve boundary değişkenine atanır.
- İnteger türünden bir dizi oluşturulur ve sınırları boundary değişkeni ile belirlenir.
- "addItem" metotu çağrılır.
- avarage metotu çağrılarak ekrana yazdırılır

### addItem Metotu:
- integer türünde array isimli bir dizi parametresi alınır.
- for döngüsü oluşturulur. i değeri 0'dan başlar ve array dizisinin elemansayısı - 1 kadar döner.
- her array[i] değerine 0-99 arası rastgele bir değer atanır.
- oluşturulan dizi "Arrays.short" metotu ile sıralanır 
- metot array dizisini geri döndürür.

### avarage metotu:
- integer türünde array isimli bir dizi parametresi alınır.
- double türünden sum isimli bir değişken oluşturulur.
- foreach döngüsü oluşturulur.
- sum değeri her seferinde 1.0/i olarak toplanır.
- döngü bitikten sonra sum değeri, dizinin eleman sayısı / sum değerine eşitlenir.
- metot sum değerini döndürür.

