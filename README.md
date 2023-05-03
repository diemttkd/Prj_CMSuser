# Prj_CMSuser
About CMS User
URL: https://cms.anhtester.com
Account: customer@example.com/ 123456

How to run test:
1. Login with Customer Account: 
- check invaid email
- invaid password
- login success
2.  Login User Page > Manage Profile (update)
3. Login User Page > Get thông tin của một mặt hàng tuỳ ý > Lưu vào sheet Excel riêng
4. Login User Page > Thêm vào giỏ hàng 2 mặt hàng tuỳ ý
5. Tiến hành thanh toán gồm: 5 bước để Checkout
     - My Cart
     - Shipping info
     - Delivery info
     - Payment
     - Confirmation
6. Run full flow from: Login User Page + Add Cart + Checkout success
7. Check Detail 1 product vừa add trong Admin Page với thông tin bên ngoài User Page
8. Log, Report + Screenshot case fail (Allure or Extent)
9. Parallel Execution mỗi lần tối đa 4 thread các case độc lập 
