function end(str, target) {

    return (str.substr(-target.length) === target);
}

end('Bastian', 'n');