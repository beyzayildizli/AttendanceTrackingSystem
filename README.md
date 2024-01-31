# Attadance Tracking System
This project is a attendance system designed using Java Swing, where both teachers and students can register and log in.
Teachers can record attendance information for the classes they teach and view attendance details for specific students.
Similarly, students can access their own attendance records.

## Database
The system utilizes MySQL as the database, and the database structure is as follows:
- **ogrenci:**  
tc, sifre, adSoyad, okulNo, yas, cinsiyet, matematik, fizik, biyoloji, kimya, edebiyat, coğrafya, tarih, felsefe, ingilizce, fransızca, almanca, arapça, din, resim, müzik, beden
- **ogretmen:**  
tc, sifre, adSoyad, telefon, yas, cinsiyet, matematik, fizik, biyoloji, kimya, edebiyat, coğrafya, tarih, felsefe, ingilizce, fransızca, almanca, arapça, din, resim, müzik, beden
- **yoklama:**  
ogrenciNo, dersAdi, tarih, baslangicSaati, bitisSaati, ogretmenTc, derseGirdi(0/1)

## Details:
1. Students and teachers can register for the system.
2. Registered students and teachers can log in.
3. The system directs users to different screens based on whether they are a student or a teacher.
4. Users can change their passwords later on.
5. Users have the option to change the theme (Dark/Light/Colorful).
6. Students can view the number of attended and missed classes, class-specific attendance status, and overall attendance information.
7. Teachers can input attendance information for students in their classes and query the attendance status of students.
   
## Screenshots

### Sign Up:
![1](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/81e4241e-9785-4ea6-a9eb-5026cdda613f)
![2](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/16af289d-faf0-45e7-9c6b-5a2d2c86267c)

#### Login:
![3](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/b9f717eb-0fe5-4c2b-99aa-a75964031cfe)

#### Teacher Screens:

![4](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/da847b30-33cc-41ae-b5e8-970b41376c75)
![5](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/f0a7a179-cacf-49ab-b390-f886eee708a3)
![6](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/366d692a-a2a2-4cbb-b14b-6b1d862ab102)
![7](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/f64161af-d9e1-443e-beea-f771c650eb1b)
![8](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/a5879b6b-fd54-485c-9213-89a32ef3051e)

#### Student Screens:
![9](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/5768a28e-c231-488d-b134-04a68ec34214)
![10](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/1e727888-5aaf-4739-b9d6-c9cc04428ea3)
![11](https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/8ac36867-d8c1-4b70-88d8-454a2ff7157f)

#### Change theme color:
<div style="display: flex; justify-content: center;">
  <img src="https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/f36fcbbb-328d-40a9-a37b-33d47b5384fb" alt="d1" width="30%">
  <img src="https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/f71cf275-31c5-444f-bce4-99724a979ab5" alt="d2" width="30%">
  <img src="https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/da4d9ef6-d4dd-4235-956d-6cc347e845ee" alt="d3" width="30%">
</div>

#### Change Password:
<div style="display: flex; justify-content: center;">
  <img src="https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/ebf97af0-493c-47a9-a395-ef3ee4b58429" alt="d1" width="60%">
  <img src="https://github.com/beyzayildizli/AttendanceTrackingSystem/assets/77398074/38ca5a09-8b82-4705-b678-a25b0fa85b0a" alt="d2" width="30%">
</div>

## Credits
This project was developed by Beyza Yıldızlı.
You can find me on [LinkedIn](https://www.linkedin.com/in/beyzayildizli/) or [GitHub](https://github.com/beyzayildizli)
