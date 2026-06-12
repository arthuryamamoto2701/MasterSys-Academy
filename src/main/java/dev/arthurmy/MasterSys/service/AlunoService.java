package dev.arthurmy.mastersys.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dev.arthurmy.mastersys.domain.Aluno;
import dev.arthurmy.mastersys.dto.AlunoRequest;
import dev.arthurmy.mastersys.dto.AlunoResponse;
import dev.arthurmy.mastersys.repository.AlunoRepository;

@Service
public class AlunoService {
    
        public final AlunoRepository alunoRepository;

        public AlunoService(AlunoRepository alunoRepository){
            this.alunoRepository = alunoRepository;
        }

        public AlunoResponse cadastrar(AlunoRequest request){
            if (request.email() != null && alunoRepository.existsByEmail(request.email())) {
                throw new RuntimeException("Já existe um aluno cadastrado com esse email.");
            }
            


            // Converte o dto AlunoRequest para a entidade Aluno
            // Salva a entidade Aluno no banco e retorna a entidade persistida
            // Converte a entidade Aluno para o DTO de resposta AlunoResponse,
            // contendo apenas os dados que serão enviados ao cliente
            Aluno aluno = request.toEntity(); 
            Aluno alunoSalvo = alunoRepository.save(aluno); 
            return AlunoResponse.fromEntity(alunoSalvo); 


            
            
        }

        public Page<AlunoResponse> listar(Pageable pageable){
            return alunoRepository.findAll(pageable).map(AlunoResponse::fromEntity); //Para cada Aluno chame AlunoResponse.fromEntity(aluno)
        }

        public AlunoResponse buscarPorId(Long id){
            Aluno aluno = buscarEntidadePorId(id);
            return AlunoResponse.fromEntity(aluno);

                
        }


        public AlunoResponse atualizar (Long id, AlunoRequest request){
            Aluno aluno = buscarEntidadePorId(id);
            request.preencher(aluno);
            Aluno alunoAtualizado = alunoRepository.save(aluno);
            return AlunoResponse.fromEntity(alunoAtualizado);

        }

        public void excluir(Long id){
            Aluno aluno = buscarEntidadePorId(id);
            alunoRepository.delete(aluno);
        }


        private Aluno buscarEntidadePorId(Long id){
            return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com o id: " + id));
        }
}
