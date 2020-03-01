tinyMCE.activeEditor = undefined;
var app=new Vue({
    el:'#app',
    data:{
        producetId:'',
        producetCode: '',
        producetName: '',
        price:'',
        stockQuantity:'',
        rewordPoints:'',
        sortOrder:'',
        productAbstract:'',
        description:'',
        selectedMainPic:'',
        selectedStatus: 1,
        mainPicUrl: '',
        selectedOtherPics:[],
        otherPicUrls:[],
        statuses:[
            {value:0,label:'下架'},
            {value: 1,label: '上架'},
            {value:2,label:'待审核'},
        ],
        mainFileList:[],
        otherFileList:[]
    },
    moundet() {
        console.log('view mounded');
        let tinymce;
        tinymce.init({
            selector:'#mytextarea'
        });
        var url=new URL(location.href);
        this.producetId=url.searchParams.get("produceId");
        if (!this.producetId){
            alert('produceId is null');
            return;
        }
        this.getProductById();
    },

    methods:{
      handleUpdateClick(){
          console.log('update click');
          let tinyMCE;
          this.description=tinyMCE.activeEditor.getContent();
          this.updateProduct();
      },
        handleOnMainChange(val){
          this.selectedMainPic=val.raw;
        },
        handleUpdloadMainClick(){
          console.log('update main pic click');
          this.uploadMainImage();
        },
        uploadMainImage() {
            var forDate=new FormData();
            forDate.append('image',this.selectedMainPic);
            axios.post('/image/upload',forDate,{
                headers:{
                    'Content-Type':'multipart/form-date'
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.mainPicUr1=response.data;
                    alert("上传成功");
                })
                .catch(function (error) {
                    console.log(error);
                    alert("上传失败");
                });
        },
        handleOnOtherChange(file,fileList){
          console.log('fileList',fileList);
          this.selectedOtherPics=fileList;
        },
        handleUploadOtherClick(){
          console.log('upload other pic click');
          this.uploadOtherImage();
        },
        handleOnOtherRemove(file,fileList){
          console.log('fileList',fileList);
          this.selectedOtherPics=fileList;
        },
        uploadOtherImage(){
         this.selectedOtherPics.forEach(pic=>{
             var formDate=new formDate();
             formDate.append("image",pic.raw);
             axios.post('/image/upload',formDate);
                // headers:{
                //     'Content-Type'
                // :
                //     '/multipart/form-data'
                //
                // }
         })
             .then(function (response) {
                 console.log(response);
                 var url=response.data;
                 app.otherPicUrls.push(url);
             })
             .catch(function (error) {
                 console.log(error);
                 alert("上传失败");
             });
        },
        updateProduct() {
            axios.post('/product/update',{
                producetId:this.producetId,
                producetName: this.producetName,
                price:this.price,
                discount:this.discount,
                stockQuantity: this.stockQuantity,
                status:this.status,
                sortOrder: this.sortOrder,
                productPoints:this.productPoints,
                description:this.description,
            })
                .then(function (respone) {
                    console.log(respone);
                    alert("修改成功");
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        getProductById() {
            axios.get('/product/getById',{
                param:{
                    producetId:this.producetId
                }
            })
                .then(function (response) {
                    console.log(response);
                    var product=response.data;
                    app.producetId=product.producetId;
                    app.producetCode=product.producetCode;
                    app.producetName=product.producetName;
                    app.price=product.price;
                    app.discount=product.discount;
                    app.stockQuantity=product.stockQuantity;
                    app.selectedStatus=product.selectedStatus;
                    app.rewordPoins=product.rewordPoins;
                    app.mainPicUr1=product.mainPicUr1;
                    app.description=product.description;
                    app.otherPicUrls=product.otherPicUrls;
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },






})