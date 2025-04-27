
function sellCar(){
    const car = document.getElementById("selectCar");
    const carIdx = car.selectedIndex;

    if(carIdx != -1){
        car.remove(carIdx);
    }else{
        alert("Select the car you want to sell!!");
    }
}