var app = new Vue({
    e1:'#app',
    data:{
        product:'',
        producet:'',
        price:'',
        discount:'',
        stockQuantity:'',
        rewordPoins:'',
        sortOrder:'',
        description:'',
        selecttedStatus:1,
        selectedMainPic:'',
        mainPicUr1:'',
        selectedOtherPics:[],
        otherPicUrls:[],
        statuses:[
            {values:0,label:'下架'},
            {values:1,label:'上架'},
            {values:2,label:'待审核'},
        ],
        methods:{
            handleCreateClick(){
                console.log('create click');
                this.createProduct();
            },
            handleOnMainChange(val){
                this.selectedMainPic=val.raw;
            },
            handleUploadMainClick(){
                console.log('upload main pic click');
                this.uploadMainIage();
            },
            uploadMainIage() {
                var formDate=new FormData();
                formDate.append("image",this.selectedMainPic);

                axios.post('/image/ipload',formDate,{
                    headers:{
                        'Content-Type':'multipart/form-data'
                    }
                })
                    .then(function (response) {
                        console.log(response);
                        app.mainPicUr1=response.data;
                        alert('上传成功');
                    })
                    .catch(function (errer) {
                        console.log(error);
                        alert("上传失败");
                    });
            },
            handleOnOtherChange(file,fileList){
                console.log('fileList',fileList);
                this.selectedOtherPics=fileList;
            },
            handleUploadOther(){
                console.log("upload other pic click");
                this.uploadOtherImage();
            },
            uploadOtherImage() {
                this.selectedOtherPics.forEach(pic=>{
                    var formDate=new FormData();
                    formDate.append("image",pic.raw);
                    axios.post('/image/upload',formDate,{
                        headers: {
                            'Content-Type':'multipart/form-data'
                        }
                    })
                        .then(function (response) {
                            console.log(response);
                            var url=response.data;
                            app.otherPicUrls.push(url);
                        })
                        .catch(function (error) {
                            console.log(error);
                            alert('上传失败');
                        });
                });
            },
            createProduct(){
                axios.post('/produce/create',{
                    producetCode: this.producetCode,
                    producetName:this.producetName,
                    price:this.price,
                    discount:this.discount,
                    stockQuantity: this.stockQuantity,
                    status:this.status,
                    mainPicUrl:this.mainPicUrl,
                    rewordPoins: this.rewordPoins,
                    sortOrder: this.sortOrder,
                    description: this.description,
                    otherPicUrls: this.otherPicUrls
                })
                    .then(function (response) {
                        console.log(response);
                        alert("创建成功");
                    })
                    .catch(function (error) {
                        console.log(error);
                    });
            }
        }
}
})