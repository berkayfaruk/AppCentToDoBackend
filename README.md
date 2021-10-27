# AppCent ToDoList SpringBoot

Uygulamada Veri tabanı olarak PostgreSQL kullanılmıştır. Veri tabanı code first yaklaışımı ile oluşturulmuştur.
Uygulamada kullanılan bağımlılıklar(dependencies) aşadağıki gibidir.

![Proje Oluşturulması](https://user-images.githubusercontent.com/59101018/139122553-b92d4df9-27ea-43bc-9ac2-daf1a29a1aaa.png)



## Layers

Java Sppring boot teknolojisi kullanılarak bir to do uygulamasının solid prensiplerine uyarak yazılması istenmiştir ve solide uygun olarak katmanlar aşağıda ki gibi oluşturulmuştur.

![Ekran görüntüsü 2021-10-27 164142](https://user-images.githubusercontent.com/59101018/139120871-a84c5f28-3a85-4897-be3f-37776f02f4cc.png)

Uygulumamızda ki Core katmanı her projede kullanılabilecek bir yapıda tasarlanmıştır ve üzerine daha eklemeler yapılacaktır.

## Swagger UI Test

Uygulumayı kullanacak olan kullanıcı için bir to do app te yapılacak ekleme, güncelleme ve silme gibi tüm işlemler swagger dökümantasyon aracılığı ile aşağıdaki gibi gözükmektedir 

![Ekran görüntüsü 2021-10-27 200913](https://user-images.githubusercontent.com/59101018/139122728-61fc5ce2-0e8f-4013-9272-c446bb9f1b29.png)

##Örnek Olarak Ekleme İşlemi 

Aşağıda iş eklemesi yapılmıştır.

![Ekran görüntüsü 2021-10-27 201522](https://user-images.githubusercontent.com/59101018/139123689-3927c020-aa5d-46fe-830e-43f1dbbed52c.png)

## Örnek Olarak Yapılacak İşleri Listeleme  
Asaşıda görüldüğü gibi yapılacak işler Json formatında listelenmiştir. Bu noktada Core katmanında kurduğumuz Result yapıları sayesinde Front-end geliştiricilerin anlaycağı şekilde mesajlar 
döndürülmüştür. Bu yapı sayesinde bu veya başka pir projede işin bir hata veya bir iş kuralına takılması durumunda front-end geliştiricilere kolaylıklar sağlanmıştır.

![Ekran görüntüsü 2021-10-27 201702](https://user-images.githubusercontent.com/59101018/139123879-7f44876a-c1be-44b6-8203-27435704dd25.png)


  
