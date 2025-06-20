document
  .getElementById("formulario")
  .addEventListener("submit", async function (e) {
    e.preventDefault();

    const dados = {
      nomeEmpresa: document.getElementById("nomeEmpresa").value,
      cnpj: document.getElementById("cnpj").value,
      telefone: document.getElementById("telefone").value,
      prazo: document.getElementById("prazo").value,
    };

    const resposta = await fetch("http://localhost:8080/api/formularios", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(dados),
    });

    const mensagem = document.getElementById("mensagem");
    if (resposta.ok) {
      mensagem.textContent = "Formulário enviado com sucesso!";
      mensagem.style.color = "green";
    } else {
      mensagem.textContent = "Erro ao enviar formulário.";
      mensagem.style.color = "red";
    }
  });
