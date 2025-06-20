async function carregarFormularios() {
      try {
        const resposta = await fetch('http://localhost:8080/api/formularios');
        const dados = await resposta.json();

        const tabela = document.querySelector('#tabelaFormularios tbody');
        tabela.innerHTML = '';

        dados.forEach(formulario => {
          const linha = document.createElement('tr');

          linha.innerHTML = `
            <td>${formulario.id}</td>
            <td>${formulario.nomeEmpresa}</td>
            <td>${formulario.cnpj}</td>
            <td>${formulario.telefone}</td>
            <td>${formulario.prazo}</td>
          `;

          tabela.appendChild(linha);
        });
      } catch (error) {
        console.error('Erro ao carregar formulários:', error);
      }
    }

    window.onload = carregarFormularios;