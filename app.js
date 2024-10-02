/*function checkevenodd(number)
{
    if(number%2==0)
    {
        console.log(number+"is even");
    }
    else{
        console.log(number+"is odd");
    }
}
checkevenodd(10);
*/
/*

function factorial(n)
{
 let fact=1;
 for(let i=n;i>=1;i--)
 {
    fact=fact*i;
 }
 console.log(fact);
}
factorial(5);
*/

/*
function revString(str)
{
     return str.split('').reverse().join('');
    
}
console.log(revString("hello"));
*/

/*
function isPrime(num){
    if(num<=1) return false;
    for(let i=2;i<num;i++)
    {
        if(num%i===0) return false;
    }
    return true;
}
console.log(isPrime(7));
*//*
function fibonacci(n)
{
    let fibSeries=[0,1];
    for(let i=2;i<n;i++)
    {
        fibSeries[i]=fibSeries[i-1]+fibSeries[i-2];

    }
    return fibSeries;
}
console.log(fibonacci(5));
*/
/*
function isPalindrome(str)
{
    let reversed=str.split('').reverse().join('');
    return str===reversed;
}
console.log(isPalindrome("madam"));
*/
/*
function arraysum(arr)
{
    let sum=0;
    for(let i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    return sum;
}
console.log(arraysum([1,2,3,4,5]));


*//*
function arraysum(arr)
{
    let sum=0;
    for(let i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    return sum;
}
console.log(arraysum([1,2,3,4,5,6,6]));
*/

/*
function largestElement(arr)
{
    let largest=arr[0];
    for(let i=1;i<arr.length;i++)
    {
        if(arr[i]>largest)
        {
            largest=arr[i];
        }
    }
    return largest;
}
console.log(largestElement([1,2,3,4,,5,6,7]);
*/
/*
function smallestElement(arr)
{
    let smallest=arr[0];
    for(let i=1;i<arr.length;i++)
    {
        if(arr[i]<smallest)
        {
            smallest=arr[i];
        }
    }
    return smallest;
}
console.log(smallestElement([1,2,3,4,5,6]));

*/

/*function arraysum(arr)
{
    let sum=0;
    for(let i=0;i<arr.length;i++)
    {
        sum+=arr[i];

    }
    return sum;
}
console.log(arraysum([1,2,3,4,5]));
*/

/*
function evenodd(number)
{
    if(number%2==0)
    {
        console.log(number+"is even");
        }
        else
        {
            console.log(number+"is odd");
        }
}
evenodd(5);
*/
/*
function revString(str)
{
    return str.split('').reverse().join('');
}
console.log(revString("hello"));
*/
/*

function isPalindrome(str)
{
    let reversed=str.split('').reverse().join('');
    return reversed===str;
}
console.log(isPalindrome("madam"));


*//*
function factorial(num)
{
    let fact=1;
    for(let i=num;i>=1;i--)
    {
        fact=fact*i;
    }
    console.log(fact);
}

factorial(6);
*/
/*
function fibonacci(num)
{
    let fibseries=[0,1];
    for(let i=2;i<num;i++)
    {
        fibseries[i]=fibseries[i-1]+fibseries[i-2];
    }
    console.log(fibseries);
}
fibonacci(5);
*/
/*

function isPrime(num)
{
    if(num<=1) return false;
    for(let i=2;i<num;i++)
    {
        if(num%i===0) return false;
    }
    return true;
}
console.log(isPrime(9));
*/
/*
function arraysum(arr)
{
    let sum=0;
    
    for(let i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    return sum;
}
console.log(arraysum([1,2,3,4,5]));

*/
/*  
function longestElement(arr)
{
    let longest=arr[0];
    for(let i=0;i<arr.length;i++)
    {
        if(arr[i]>longest)
        {
            longest=arr[i];
        }
        
    }
    return longest;
}
console.log(longestElement([1,2,3,4,5,6,6,6,7,7,7,7]));
*/

/*
function smallestElement(arr)
{
    let smallest=arr[0];
    for(let i=0;i<arr.length;i++)
    {
        if(arr[i]<smallest)
        {
            smallest=arr[i];

        }
    }
    return smallest;
}
console.log(smallestElement([1,2,3,4,5,6,7,8]));
*/
/*
function leapYear(year)
{
    if((year%2==0 && year%100!=0 )||( year%4==0))
    {
        return true;
    }
    return false;
}
console.log(leapYear(2004));
*/
console.log(a);
let a=10;
