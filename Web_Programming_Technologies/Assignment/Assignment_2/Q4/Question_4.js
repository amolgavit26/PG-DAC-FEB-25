

const link = document.getElementById("highlightLink");
const text = document.querySelectorAll("xyz");

link.addEventListener("mouseover", () =>
    text.forEach(word => word.classList.add("highlight"))
);

link.addEventListener("mouseout", () =>
    text.forEach(word => word.classList.remove("highlight"))
);