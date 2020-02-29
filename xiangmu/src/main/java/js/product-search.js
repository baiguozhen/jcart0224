var app=new Vue({
    el:'#app',
    data:{
        pageInfo:'',
        pageNum:1,
    },
    moundet(){
        console.log('view mounted');
        this.serachProduct();
    },
    methods: {
        handlePageChange(val){
            console.log('page change');
            this.pageNum=val;
            this.serachProduct();
        },

        serachProduct() {
            axios.get('/product/search',{
                params:{
                    pageNum:this.pageNum
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.pageInfo=response.data;
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})