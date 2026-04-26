# KargoSmart
KargoSmart: Akıllı Kargo Yönetim Sistemi
Bu proje, Nesne Yönelimli Programlama 2 dersi kapsamında geliştirilmiş; kargo takip, şube ve kurye yönetimi süreçlerini simüle eden full-stack bir Java uygulamasıdır.

# Hızlı Başlangıç
•	Sistem Gereksinimleri: Java 21+ ve Maven 3.8.0+ yüklü olmalıdır.
•	Çalıştırma: Terminalde proje dizinine gidip mvn spring-boot:run komutunu yazmanız yeterlidir.
•	Erişim: Uygulama ayağa kalktıktan sonra tarayıcıdan http://localhost:8081 adresine gidiniz.

# Uygulanan OOP Prensipleri
Hocanın formundaki kriterlere uygun olarak projede şu yapılar kullanılmıştır:
•	Inheritance (Kalıtım): User.java abstract base class olarak tanımlanmış; Customer ve Courier sınıfları bu sınıftan türetilmiştir.
•	Interface Kullanımı: ITrackable.java interface'i ile kargo takip yetenekleri standartlaştırılmıştır.
•	Encapsulation (Kapsülleme): Tüm model sınıflarında alanlar private tutulmuş, verilere erişim getter/setter metotları ile sağlanmıştır.
•	Abstraction (Soyutlama): Temel iş mantığı soyut sınıflar ve arayüzler üzerine kurgulanarak tasarım bütünlüğü sağlanmıştır.

 # Örnek Takip Verileri
Sistem açıldığında test etmeniz için aşağıdaki veriler otomatik olarak yüklenir:
•	TR-98245-A: Ali Yılmaz (Durum: Yolda) 
•	TR-98246-B: Veli Demir (Durum: Teslim Edildi) 
•	TR-98247-C: Ayşe Kaya (Durum: Şubede) 

🌐 Web Arayüzüne Erişim

URL Adresleri

Sunucu başlatıldıktan sonra tarayıcıda aşağıdaki adresleri ziyaret et:

| Sayfa | URL | Açıklama |
|-------|-----|----------|
| 🏠 Ana Sayfa | http://localhost:8081 | Kargo takip ana sayfası |
| 📦 Gönderiler | http://localhost:8081/gonderiler | Tüm gönderiler listesi |
| 🚗 Filo ve Kuryeler | http://localhost:8081/filo | Aktif kuryeler ve araçlar |
| 🏢 Şubeler | http://localhost:8081/subeler | Operasyon merkezleri |
| 👥 Müşteriler | http://localhost:8081/musteriler | Müşteri veritabanı |
| 🔐 Giriş | http://localhost:8081/giris | Kullanıcı girişi |

  H2 Veritabanı Konsolu (Opsiyonel)

Veritabanını direkt incelemek için:

URL: http://localhost:8081/h2-console
JDBC URL: jdbc:h2:mem:kargosmartdb
Kullanıcı Adı: sa
Parola: (boş bırak)

📊 Arayüz Sayfaları

  Ana Sayfa (Ana Takip)

URL: http://localhost:8081
Fonksiyonlar:
- Kargo takip numarası gir
- "SORGULA" butonuna tıkla
- Kargo durumunu gör

**Örnek Takip Numaraları:**
- TR-98245-A
- TR-98246-B
- TR-98247-C

 Otomatik Yüklenen Veriler

Sistem ilk başlatıldığında 3 adet örnek kargo otomatik olarak yüklenir:

┌──────────────┬──────────────┬─────────────┬──────────┬──────────┐
│ Takip No     │ Müşteri      │ Durum       │ Konum    │ Tarih    │
├──────────────┼──────────────┼─────────────┼──────────┼──────────┤
│ TR-98245-A   │ Ali Yılmaz   │ 🟡 Yolda    │ Ankara   │ 5s. önce │
│ TR-98246-B   │ Veli Demir   │ ✅ Teslim   │ İstanbul │ 2s. önce │
│ TR-98247-C   │ Ayşe Kaya    │ 📦 Şubede   │ İzmir    │ 1g. önce │
└──────────────┴──────────────┴─────────────┴──────────┴──────────┘

 #  Dosya İzleyen Açıklamalar

| Dosya | Amaç | OOP |
|-------|------|-----|
| **User.java** | Abstract base class | ✅ Inheritance |
| **Customer.java** | Müşteri sınıfı | ✅ Extends User |
| **Courier.java** | Kurye sınıfı | ✅ Extends User + Implements |
| **ITrackable.java** | Takip interface'i | ✅ Interface |
| **HomeController.java** | Ana sayfa & ara | ✅ Controller |
| **DataInitializer.java** | Başlangıç verileri | ✅ Configuration |

  📚 Kaynaklar

- **Spring Boot**: https://spring.io/projects/spring-boot
- **JPA/Hibernate**: https://hibernate.org/
- **Thymeleaf**: https://www.thymeleaf.org/
- **H2 Database**: https://www.h2database.com/
- **Maven**: https://maven.apache.org/
