// const sum = (numbers) => {
//     return numbers.reduce((acc, num) => acc + num)
// }

// const avg = (sum, size) => sum / size

// const arr = [4,5,6,4];
// console.log(avg(sum(arr),arr.length));


// const fact = (num) => {
//     if (num == 1) {
//         return num;
//     } else {
//         return num*fact(num-1);
//     }
// }


// console.log(fact(5));
// hoisting 
// bind: cambia  de contexto


// https://medium.com/justcodenow/building-the-right-way-html5-semantics-7190bdb269c4
// https://www.semrush.com/blog/semantic-html5-guide/

// https://www.smashingmagazine.com/2007/07/css-specificity-things-you-should-know/
// http://getbem.com/introduction/
// https://smacss.com/

// https://github.com/getify/You-Dont-Know-JS


// const sum = (numbers) => {
//     return numbers.reduce((acc, num) => acc + num)
// }

// const avg = (sum, size) => sum / size

// const arr = [4,5,6,4];
// console.log(avg(sum(arr),arr.length));


// const fact = (num) => {
//     if (num == 1) {
//         return num;
//     } else {
//         return num*fact(num-1);
//     }
// } 




// console.log(fact(5));



// /*


// https://medium.com/justcodenow/building-the-right-way-html5-semantics-7190bdb269c4
// https://www.semrush.com/blog/semantic-html5-guide/

// https://www.smashingmagazine.com/2007/07/css-specificity-things-you-should-know/
// http://getbem.com/introduction/
// https://smacss.com/

// https://github.com/getify/You-Dont-Know-JS



// */










// declare function sample(a:number, b:string);


// function sample(a:number, b:string) {
//     // aksjdlkajsdlkjalkds
// }


// function average(...values) {
//     console.log(values);
// }

// average(1,2,3,4,5,6)

// const w = `Hola ${document.querySelector('.CodePreviewer-console').innerHTML=''}`; 
// console.log(w);

// // Inner Invoked function expression
// // IIFE

// /*
// (function(){
//     console.log('ajshdkahsdk');
// })();


  // let a = 1;
  // function b() {
  //   a = 10;
  //   return;
  // }
  // // a = null
  // b();
  // console.log(a);

// function sample() {
//     console.log(this.hello);
// }


// const w = sample.bind({hello: 'Hola Mateo'})();
// console.log(w)

// // let i = 0;
// // // console.log('=>', ++i);
// // // console.log('=>', i++);

// console.log(10 >> 1)
// console.log(10 % 2 == 0)
// console.log(!(12 & 1))
// // */




// function foo(a) {
//   console.log( a + b );
// }
// var b = 2;
// foo( 2 ); // 4

// function foo(a) {
// 	console.log( a + b );
// 	b = a;
// }

// foo( 2 );

// const palabra = "My life will be wonderful I’ll probably will have done a big house with green zones with games for childs and one big gym, I hope have pets for walk with them every day by myself, or if a have a couple (I wish), to walk with her and pets too. I will have a healthy life to do all the things I could do when I was young. In the mornings I will go to run or go to the gym with the pets after the have the breakfast, I will be a university teacher or a owner of a good company  then I will go to my work see how everything is ok and try always for make better and new things for let people that works with me learn and apply all in their jobs or lives. For that reason I will be so strict with the new interviews, because I only will work with people that enjoys do that we will do and wants to set better things every day. At afternoons I will practice some sport like football soccer, tennis or swimming sometimes with my couple or the pest or both If I couldn’t go with them I will go out with them before the sports,"

// console.log(palabra.split(" ").slice(3, 90));


// function foo(str, a) {
// 	eval( str ); // cheating!
// 	console.log( a, b );
// }

// var b = 2;

// foo( "b = 3;", 1 ); 
// console.log(b);
// const foo = { id: 1, height: '200px', width: '100px' };
// const bar = { id: 2, height: '250px', width: '200px' };
// console.warn( foo );
// console.error( bar );

// console.group('Shopping Cart');
// console.log('user: John Doe');
// // Group Start
// console.group('Shopping item');
// console.log('Name: JS Book 1');
// console.log('Author: Unknown author');
// console.log('ISBN: 048665088X');
// console.groupEnd();
// // Group strat
// console.group('Shopping item');
// console.log('Name: JS Book 2');
// console.log('Author: Unknown author');
// console.log('ISBN: 048665087X');
// console.groupEnd();
// console.groupEnd();

// console.table({foo, bar });

// console.time();
// for (let i = 0; i < 100000; i++) {
//   // some code
// }
// console.timeEnd();
// console.dir()

// var MyReallyCoolLibrary = {
// 	awesome: "stuff",
// 	doSomething: function() {
// 		console.log("gato")
// 	},
// 	doAnotherThing: function() {
// 		console.log("perro")
// 	}
// };

// MyReallyCoolLibrary.doAnotherThing();


// var a = 2;

// function foo() { // <-- insert this

// 	var a = 3;
// 	console.log( a ); // 3

// } // <-- and this
// foo(); // <-- and this

// console.log( a ); // 2

//  var a = 2;

// (function foo(){ // <-- insert this

// 	var a = 3;
// 	console.log( a ); // 3

// })(); // <-- and this

// console.log( a ); // 2

// var undefined = true; // setting a land-mine for other code! avoid!

// (function IIFE( undefined ){

// 	var a;
// 	if (a === undefined) {
// 		console.log( "Undefined is safe here!" );
// 	}

// })();

// var foo = true;

// if (foo) {
// 	let bar = foo * 2;
// 	bar = Math.sqrt(3);
// 	console.log( bar );
// }

// console.log( bar );

// function foo() {
// 	var a = 2;

// 	function bar() {
// 		return a;
// 	}

// 	return bar;
// }

// var baz = foo();

// const p = baz();


// // console.log(p);
// {
// for (var i=1; i<=5; i++) {
// 	setTimeout( function timer(){
// 		console.log( i );
// 	}, i*1000 );
// }
// }


  // for (var id=1; id<=5; id++) {
  //   (function(){
  //     setTimeout( function timer(){
  //       console.log( id );
  //     }, id*1000 );
  //   })();
  // }

  // for (var i=1; i<=5; i++) {
  //   (function(j){
  //     setTimeout( function timer(){
  //       console.log( j );
  //     }, j*1000 );
  //   })( i );
  // }

  // for (var i=1; i<=5; i++) {
  //   let j = i; // yay, block-scope for closure!
  //   setTimeout( function timer(){
  //     console.log( j );
  //   }, j*1000 );
  // }

  // for (let i=1; i<=5; i++) {
  //   setTimeout( function timer(){
  //     console.log( i );
  //   }, i*1000 );
  // }


  // MODULES 

  function foo() {
    var something = "cool";
    var another = [1, 2, 3];
  
    function doSomething() {
      console.log( something );
    }
  
    function doAnother() {
      console.log( another.join( " ! " ) );
    }
  }