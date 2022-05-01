g++ $1
if test -f "a.out"; then
    chmod +x a.out
    ./a.out
fi