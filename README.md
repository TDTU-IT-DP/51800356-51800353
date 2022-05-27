<div align="center">

**TỔNG LIÊN ĐOÀN LAO ĐỘNG VIỆT NAM**<br>
**TRƯỜNG ĐẠI HỌC TÔN ĐỨC THẮNG**<br>
**KHOA CÔNG NGHỆ THÔNG TIN**

<img src="https://upload.wikimedia.org/wikipedia/vi/1/1b/TĐT_logo.png"  alt="TDT-Logo" width="100">

#### BÀI TẬP TIỂU LUẬN GIỮA KỲ MÔN

#### MẪU THIẾT KẾ


</div>

<div align="right" style="margin-top: 150px">

_Người hướng dẫn:_ **Thầy Đặng Huỳnh Trung Tín** <br>
_Người thực hiện:_ **Nguyễn Phú Cường - 51800356** <br>
**Viên Quốc Chuyên - 51800353** <br>
_Khóa:_ **22**

</div>

<div align="center" style="margin-top: 50px">

**THÀNH PHỐ HỒ CHÍ MINH, NĂM 2022**

</div>

---

### 1. GIỚI THIỆU VỀ BÀI TOÁN ỨNG DỤNG

#### 1.1. Bài toán ứng dụng 1

Giả sử trong một hệ thống của công ty nọ có các tài liệu công việc. Mọi người dùng trong hệ thống không phải ai cũng có quyền mở, xem, ghi, đóng file. Một vài người có thể có toàn quyền, cũng có một số người chỉ giới hạn ở mức xem và đóng file. Làm thế nào để khi thêm người mới vào hệ thống thì bằng 1 cách nào đó đơn giản nhất có thể giới hạn quyền của người dùng đó ngay lập tức. Ở đây chúng em áp dụng proxy pattern, về lí do sẽ được nêu rõ ở những phần bên dưới. 

#### 1.2. Bài toán ứng dụng 2

Giả sử chúng ta muốn xây dựng một chương trình mô phỏng lại hành động của các con vật nuôi trong nhà và ban đầu chúng ta mới chỉ nghĩ ra được một hành động của các con vật là tạo ra âm thanh.

### 2. YÊU CẦU

#### 2.1 Visual studio code
#### 2.Java Development Kit (JDK)

### 3. CÁCH THỰC THI ỨNG DỤNG

#### 3.1. Đối với Proxy Pattern

 - 1.Mở thư mục project bằng Visual Studio Code
 - 2.Truy cập Main.java (Đường dẫn : /ProxyPattern/Main.java)
 - 3.Chọn Run java

#### 3.2. Đối với Visitor Pattern

 - 1.Mở thư mục project bằng Visual Studio Code
 - 2.Truy cập Test.java (Đường dẫn : /VisitorPattern/Main.java)
 - 3.Chọn Run java

### 4. TÌM HIỂU VÀ TRIỂN KHAI PATTERN

#### 4.1. Proxy Pattern

##### 4.1.1. Giới thiệu chung về Proxy Pattern

###### 4.1.1.1. Giới thiệu 

Như chúng ta đã biết, mẫu thiết kế được chia làm 3 nhóm chính: Nhóm khởi tạo (creational pattern), nhóm cấu trúc (structural pattern) và nhóm hành vi (behavioral pattern). Mỗi nhóm sẽ có những chức năng khác nhau. Nhóm Khởi tạo cung cấp giải pháp liên quan đến khởi tạo đối tượng, che giấu logic của việc tạo nó, thay vì khởi tạo trực tiếp đối tượng bằng phương thức new. Nhóm Cấu trúc liên quan tới lớp và các thành phần đối tượng. Nhưng mẫu thiết kế thuộc nhóm này nhằm định nghĩa, thiết lập quan hệ giữa các đối tượng. Nhóm Hành vi được dùng trong thực hiện hành vi của các đối tượng. Áp dụng mẫu thiết kế góp phần giúp cho code dễ dàng đọc, hiểu, bảo trì hơn. Mẫu thiết kế cũng giúp các nhà phát triển tạo ra hệ thống phần mềm đảm bảo cho code của họ tuân thủ nguyên tắc thiết kế phần mềm. Ở phần này, chúng ta sẽ đi tìm hiểu một mẫu thiết kế thuộc nhóm Cấu trúc, đó là Proxy.

Proxy trong tiếng Anh có nghĩa là “Ủy quyền” hoặc “Người đại diện”, là một mẫu thiết kế thuộc nhóm Cấu trúc (Structural pattern). Proxy cho phép cung cấp một đối tượng, lớp thay thế sẽ được ủy quyền, đại diện cho đối tượng, lớp khác. Nó kiểm soát quyền truy cập đối với đối tượng ban đầu, tất cả các truy cập trực tiếp đến một đối tượng gốc ban đầu sẽ được chuyển vào lớp trung gian (lớp Proxy). Lớp này cho phép thêm điều kiện, thực hiện một điều gì đó trước khi yêu cầu được chuyển đến đối tượng gốc.

###### 4.1.1.2. Phân loại Proxy Pattern


###### 4.1.1.2.1. Virtual Proxy

Khi có một đối tượng dịch vụ có cấu trúc phức tạp, chứa dữ liệu lớn luôn luôn chạy làm lãng phí tài nguyên hệ thống, mặc dù chỉ cần gọi nó trong một vài trường hợp. Thay vì khởi tạo đối tượng khi ứng dụng chạy, proxy sẽ tạo đối tượng ở lần truy xuất đầu tiên, những lần gọi kế tiếp chỉ cần tái sử dụng lại mà không cần khởi tạo, nhằm tiết kiệm tài nguyên hệ thống. 

###### 4.1.1.2.2. Protection Proxy

Chúng ta sử dụng Protection Proxy khi muốn chỉ ra những đối tượng cụ thể mới có thể sử dụng dịch vụ, chức năng nào đó bằng các điều kiện ràng buộc bổ sung. Lúc này việc sử dụng protection proxy là cần thiết. Nó chỉ có thể chuyển yêu cầu đến các đối tượng chức năng nếu thông tin người dùng phù hợp với các điều kiện mà người phát triển đã đặt ra. Ví dụ, để có thể thực hiện chức năng quản lý tài khoản thì phải yêu cầu tài khoản đăng nhập có vai trò là Admin, những tài khoản khác thì không cho phép.

###### 4.1.1.2.3. Remote Proxy

Remote proxy cung cấp một đối tượng cục bộ tham chiếu đến một đối tượng khác ở một vị trí khác, thường thông qua kết nối mạng. Proxy thực hiện các hành động cần thiết để mã hóa các yêu cầu chuyển mạng và chấp nhận kết quả từ tài nguyên ở xa trước khi trả lại cho máy khách. 

###### 4.1.1.2.4. Logging Proxy

Khi muốn giữ lịch sử của các yêu cầu đối với đối tượng dịch vụ, lúc này sẽ cần sử dụng logging proxy. Proxy này có thể lưu lại từng yêu cầu trước khi chuyển nó đến dịch vụ.

###### 4.1.1.2.5. Cache Proxy

Cung cấp không gian lưu trữ tạm thời cho các kết quả trả về từ đối tượng nào đó, đặc biệt nếu kết quả trả về lớn. Kết quả này sẽ được tái sử dụng nếu các máy khách có chung một yêu cầu gửi đến. Proxy có thể sử dụng các tham số của yêu cầu làm khóa bộ nhớ cache.

###### 4.1.1.2.6. Smart Reference Proxy

Bổ sung thêm các hành động, phần mở rộng bất cứ khi nào một đối tượng được tham chiếu. Ví dụ: đếm số lượng tham chiếu đến một đối tượng. Ngoài ra, còn một số loại proxy khác như: Monitor Proxy, Firewall Proxy, Synchronization Proxy, Copy-On-Write Proxy,…

###### 4.1.1.3. Cấu trúc của Proxy Pattern

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170717076-1f8d6140-1e36-4dc6-9911-02649c64fc26.png">

Sơ đồ lớp tổng quát của Proxy Pattern

</div>

Các đối tượng tham gia vào Proxy Pattern:
- Subject: Là một Interface định nghĩa các phương thức giao tiếp với client. Nó xác định giao diện chung cho RealSubject (đối tượng thực) và Proxy.
- RealSubject: Là một lớp dịch vụ sẽ thực hiện các thao tác, chức năng thực sự khi có yêu cầu từ phía client.
- Proxy: Là một lớp đại diện cho RealSubject nhằm thực hiện các xử lý các yêu cầu trước và sau khi nó được gửi đến RealSubject. Proxy duy trì một tham chiếu đến đối tượng của RealSubject nhằm truy cập/truy xuất dữ liệu của lớp này.
- Client: Đối tượng sử dụng RealSubject nhưng phải thông qua Proxy.

##### 4.1.2. Đặt vấn đề

Theo như những gì chúng ta đã tìm hiểu, Proxy Pattern được sử dụng để kiểm tra các điều kiện nhất định. Một số đối tượng hoặc tài nguyên cần ủy quyền thích hợp để truy cập chúng, do đó, sử dụng Proxy Pattern là một trong những cách để kiểm tra các điều kiện này. Với Proxy Pattern, chúng ta sẽ kiểm soát quyền truy cập đến các đối tượng linh hoạt hơn.

Ví dụ, chúng ta muốn kiểm soát quyền truy cập vào tài nguyên hệ thống có nhiều loại người dùng. Ở trong hệ thống, chúng ta sẽ có người dùng được phép xem hoặc chỉnh sửa tài nguyên, và một số người khác có thể thực hiện xem, xóa, sửa với tài nguyên.
Giả sử chúng ta có một lớp interface Parent có phương thức là doExam(). Đồng thời ta cũng có một lớp Child implement đến lớp Parent và override phương thức doExam().

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170719007-7b13b3cd-5b98-47bd-90c6-ba3ad4f93245.png">

Cấu trúc đối tượng ban đầu

</div>

Nếu muốn bổ sung các ràng buộc để đối tượng Child phải thỏa mãn thì mới thực hiện hàm doExam(), chúng ta phải thêm các câu lệnh vào trong hàm doExam() hoặc phải viết thêm một phương thức mới checkDoExam(). Sau đó thêm câu lệnh kiểm tra vào hàm doExam().

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170719047-be3606b0-66d5-405d-9e6b-9b26422410d7.png">

Thêm phương thức checkDoExam vào lớp Child

</div>

Vì trường hợp đưa ra ở đây chỉ có một hàm doExam() nên chúng ta thấy đơn giản. Nếu mà lớp Parent có rất nhiều phương thức và lớp Child phải override các phương thức này thì chắc chắn sẽ phải viết rất nhiều câu lệnh kiểm tra hoặc viết thêm các hàm mới. Nhưng nếu làm như vậy, chúng ta sẽ thay đổi cấu trúc của những lớp, hàm, phương thức đã viết trước đó. Điều này là một điều tối kỵ trong lập trình. Bởi vì nếu làm như vậy, chúng ta đã vi phạm nguyên tắc đóng mở trong lập trình. Mặt khác, nếu sửa đổi source code của module hoặc lớp có sẵn, nếu không may ta sẽ làm ảnh hưởng đến tính đúng đắn của chương trình. Hơn nữa, nếu tiến hành sửa trực tiếp trên các lớp có sẵn, nếu bị lỗi thì chương trình sẽ không thực thi được như ý muốn.

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170719520-128ec638-77ef-4c1c-aa7e-6f946cb3fe3f.png">

Mỗi phương thức được override từ lớp cha phải thêm các phương thức kiểm tra

</div>

Vì vậy chúng ta cần tạo lớp mới, ta nên kế thừa và mở rộng các module/class có sẵn. Ở trong ví dụ này, cần tạo một lớp Protection Proxy và implement lớp Parent. Các sửa đổi về điều kiện sẽ được thêm vào các hàm override từ lớp Parent.

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170719539-9f5e127b-cd08-4344-9143-8bab34c78360.png">

Áp dụng Protection Proxy để giải quyết vấn đề của cấu trúc đối tượng trên

</div>

##### 4.1.3. Áp dụng Proxy Pattern vào ví dụ cụ thể

Khi chúng ta áp dụng Protection Proxy, có nghĩa là chúng ta sẽ không thay đổi trong các lớp đã được tạo trước đó mà ta sẽ tạo thêm lớp Proxy mới. nhằm thực hiện các xử lý các yêu cầu trước khi nó được gửi đến lớp Person. Proxy duy trì một tham chiếu đến đối tượng của lớp Person nhằm truy cập/truy xuất dữ liệu của lớp này. Chúng ta sẽ đặt tên cho lớp Proxy này là PersonProtectProxy. Lớp này sẽ kế thừa từ interface Action và nó sẽ có 3 thuộc tính là name, role và person. 4 chức năng openFile, readFile, writeFile và closeFile sẽ thêm các ràng buộc điều kiện. Chỉ khi người dùng có vai trò là “Admin”, “Manager” mới có thể thực thi 4 chức năng này.

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170720841-d9b43a93-7b77-49a0-9cb3-3e8547482ce7.png">

Cấu trúc đối tượng truy xuất file ban đầu

</div>

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170721240-b4c88f16-49ce-4941-8466-66db5ba24757.png">

Sơ đồ lớp của cấu trúc đối tượng sau khi áp dụng Protection Proxy 

</div>

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170728333-071da23f-0600-42f1-81ee-252fe205164b.png">
</div>

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170728344-f8cb6229-cc4b-40da-b1ad-f4ff3dfa0d73.png">

Code của lớp PersonProtectProxy

</div>

Tiếp theo, tiến hành tạo hàm Main để thực thi chương trinh sau khi áp dụng Protection Proxy. Chúng ta cũng sẽ khởi tạo 2 đối tượng person1, person2, thuộc kiểu PersonProtectProxy với tên gọi và vai trò lần lượt là (Cuong, Admin), (Chuyen, Accountant). Sau đó sẽ gọi 4 phương thức openFile, readFile, writeFile, closeFile.

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170721259-264cd668-d462-41e9-8704-51a7c9c7fe36.png">

Thực thi chương trình sau khi áp dụng Protection Proxy Pattern

</div>

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170721557-c7dd727e-030c-4b24-afa4-a7b6621500e2.png">

Kết quả thực thi chương trình sau khi áp dụng Protection Proxy Pattern

</div>


##### 4.1.4. Tóm tắt Proxy Pattern

Tên Pattern: Proxy.

Nhóm Pattern: nhóm cấu trúc.

Định nghĩa: Proxy là một mẫu thiết kế cho phép ta cung cấp thêm một đối tượng, lớp thay thế cho lớp gốc ban đầu. Lớp Proxy đại diện cho đối tượng gốc đó, do đó nó sẽ kiểm soát quyền truy cập đối này. Tất cả các truy cập trực tiếp đến một đối tượng gốc ban đầu sẽ được chuyển vào lớp trung gian Proxy. Lớp này cho phép thêm điều kiện, thực hiện một điều gì đó trước khi yêu cầu được chuyển đến đối tượng gốc.

Sơ đồ lớp tổng quát:

<div align="center">

<img src="https://user-images.githubusercontent.com/75523801/170729192-de4d217b-a4e1-4c7b-861c-ccb0203f586e.png">

Kết quả thực thi chương trình sau khi áp dụng Protection Proxy Pattern

</div>

Các thành phần trong sơ đồ lớp tổng quát:
- Subject: Là một Interface định nghĩa các phương thức giao tiếp với client. Nó xác định phương thức chung cho RealSubject (đối tượng thực) và Proxy.
- RealSubject: Là một lớp sẽ thực hiện các thao tác, chức năng thực sự khi có yêu cầu từ phía client.
- Proxy: Là một lớp đại diện cho RealSubject nhằm thực hiện các xử lý các yêu cầu trước và sau đó nó được gửi đến lớp RealSubject. Proxy duy trì một tham chiếu đến đối tượng của RealSubject nhằm truy cập/truy xuất dữ liệu của lớp này.
- Client: Đối tượng sử dụng RealSubject nhưng phải thông qua Proxy.

Vấn đề áp dụng: Khi muốn bổ sung các điều kiện vào các lớp có sẵn, chúng ta không thể trực tiếp sửa đổi các source code này vì làm như vậy sẽ vi phạm nguyên tắc đóng mở trong lập trình. Vì vậy, cần phải tạo một lớp Proxy mới, lớp này sẽ kiểm tra các điều kiện trước khi gọi đến các đối tượng gốc ban đầu.

Các bài toán nên sử dụng Proxy Pattern: 
- Kiểm soát quyền truy xuất các phương thức của đối tượng.
- Bổ sung thêm các chức năng, ràng buộc điều kiện trước khi thực thi phương thức của đối tượng gốc
- Bổ sung các phương thức, chức năng mới cho đối tượng gốc mà không sửa đổi code của nó.
- Tiết kiệm bộ nhớ, thời gian khi có nhiều truy cập vào các đối tượng có chi phí khởi tạo lớn.
- Khi muốn theo dõi trạng thái và vòng đời đối tượng	
- Khi đối tượng gốc nằm trong hệ thống cũ hoặc thư viện bên thứ 3.

Ưu điểm:
- Proxy góp phần làm tăng tính bảo mật cho chương trình bằng cách thêm các điều kiện trước khi gọi tới lớp có sẵn.
- Proxy khá là dễ áp dụng vào các dự án.
- Proxy có thể giúp cải thiện hiệu suất của ứng dụng bằng cách lưu vào bộ nhớ đệm các đối tượng nặng hoặc các đối tượng được truy cập thường xuyên.
- Lập trình viên có thể kiểm soát được chức năng, dịch vụ mà không cần phía máy khách biết về nó.
- Lập trình viên có thể quản lý của vòng đời của chức năng khi mà phía máy khách không quan tâm đến nó
- Proxy hoạt động ngay cả khi dịch vụ không sẵn sàng hoặc không có sẵn.

Khuyết điểm:
- Code sẽ trở nên phức tạp hơn khi phải tạo ra nhiều lớp proxy mới.
- Phản hồi từ đối tượng dịch vụ của thể bị chậm trễ.


##### 4.1.5. Kết luận

Với sự đa dạng và các ưu điểm của Proxy Pattern, lập trình viên có thể tận dụng pattern này để thiết kế code cũng như là hệ thống trở nên linh hoạt, hoạt động tốt hơn mà vẫn đảm bảo sự toàn vẹn của các lớp đối tượng ban đầu.